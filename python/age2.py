from datetime import datetime
import calendar

# Get birthday input
birthday_str = input("Enter your birthday (YYYY-MM-DD):\n")
birthday = datetime.strptime(birthday_str, "%Y-%m-%d")
today = datetime.today()

# Calculate years
years = today.year - birthday.year

# Calculate months
if today.month >= birthday.month:
    months = today.month - birthday.month
else:
    years -= 1
    months = 12 + today.month - birthday.month

# Calculate days
if today.day >= birthday.day:
    days = today.day - birthday.day
else:
    months -= 1
    if months < 0:
        months = 11
        years -= 1
    # Get days in the previous month
    prev_month = today.month - 1 if today.month > 1 else 12
    prev_year = today.year if today.month > 1 else today.year - 1
    days_in_prev_month = calendar.monthrange(prev_year, prev_month)[1]
    days = days_in_prev_month + today.day - birthday.day

# Display result
print(f"Your age is: {years} years, {months} months, and {days} days")
