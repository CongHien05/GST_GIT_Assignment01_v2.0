class FibonacciImpl1 : FibonacciInterface {
    override fun Fibonacci(n: Int, flag: Boolean): Int {
        if (!flag) return -1 // Chỉ chạy đệ quy khi flag = True
        if (n <= 1) return n
        return Fibonacci(n - 1, true) + Fibonacci(n - 2, true)
    }
}