def two_indeces(nums,target):
    """returns indeces of two numbers in a list that add up to target."""
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in seen:
            return [seen[complement], i]
        seen[num] = i
    return []

if __name__ == "__main__":
    nums = [2,7,11,15]
    target = 9
    indeces = two_indeces(nums, target)
    print(indeces)