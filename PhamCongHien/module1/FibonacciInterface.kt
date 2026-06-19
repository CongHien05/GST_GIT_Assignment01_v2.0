class FibonacciImpl2 : FibonacciInterface {
    override fun Fibonacci(n: Int, flag: Boolean): Int {
        if (flag) return -1 // Chỉ chạy for khi flag = False
        if (n <= 1) return n
        var a = 0
        var b = 1
        var sum = 0
        for (i in 2..n) {
            sum = a + b
            a = b
            b = sum
        }
        return sum
    }
}