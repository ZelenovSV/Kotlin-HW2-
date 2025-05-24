fun main() {

    val amount = 5000
    val comission = if (amount / 100 * 0.75 > 35.0) amount / 100 * 0.75 else 35.0
    val totalAmount = amount - comission
    println("Сумма к переводу: ${amount}, Комиссия: ${comission}")
    println("Итого, с учётом комиссии: ${totalAmount}")
}