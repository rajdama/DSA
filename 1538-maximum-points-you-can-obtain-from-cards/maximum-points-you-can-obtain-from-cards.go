func Max(a,b int) int {
    if a > b {
        return a
    }else{
        return b
    }
}

func maxScore(cardPoints []int, k int) int {
        lsum := 0
        rsum := 0
        max := 0
        n := len(cardPoints)
        for i:=0; i<k; i++{
            lsum = lsum + cardPoints[i]
        }
        max = lsum;
        pointer := n-1
        for i:= k-1; i>=0; i--{
            lsum = lsum - cardPoints[i]
            rsum = rsum + cardPoints[pointer]
            max= Max(max,lsum+rsum)
            pointer--
        }
        return max
}
