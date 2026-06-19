// Định nghĩa class cho nhánh impl1 (Đệ quy)
class FibonacciImpl1 : FibonacciInterface {
    override fun Fibonacci(n: Int, flag: Boolean): Int {
        if (!flag) return -1 // Chỉ chạy đệ quy khi flag = True
        if (n <= 1) return n
        return Fibonacci(n - 1, true) + Fibonacci(n - 2, true)
    }
}

// Định nghĩa class cho nhánh impl2 (Vòng lặp For)
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