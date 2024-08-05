func lessThanEquals(a []int, k int) int {
    if (k < 0) {
        return 0
    }
    sum := 0
    count := 0
    left := 0
    right := 0
    for (right < len(a)) {
        sum += a[right]
        for (sum > k) {
            sum -= a[left]
            left++
        }
        count += right - left + 1
        right++
    }
    return count
}

func numSubarraysWithSum(nums []int, goal int) int {
    return lessThanEquals(nums, goal) - lessThanEquals(nums, goal-1)
}