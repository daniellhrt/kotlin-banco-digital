fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        "Daniel",
        1001
    )
    val contaPoupanca = ContaPoupanca(
        "Fernanda",
        1002
    )
    val contaSalario = ContaSalario(
        "Henrique",
        1003
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(500.0)

    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupança: ${contaPoupanca.saldo}")
    println("Saldo conta salário: ${contaSalario.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(50.0)

    println("Valor após saque...")
    println("Saldo corrente ${contaCorrente.saldo}")
    println("Saldo poupança ${contaPoupanca.saldo}")
    println("Saldo salário ${contaSalario.saldo}")
    println()

    contaCorrente.transfere(25.0, contaPoupanca)
    println("Valor após trasferencia de R$25,00")
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupança: ${contaPoupanca.saldo}")
    println()

    contaCorrente.transfere(25.0, contaSalario)
    println("Valor após trasferencia de R$25,00 para conta salário")
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta salário: ${contaSalario.saldo}")

}