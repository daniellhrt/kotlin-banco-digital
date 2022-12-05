 fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        "Daniel",
        1001
    )
    val contaPoupanca = ContaPoupanca(
        "Fernanda",
        1002
    )

    contaCorrente.deposita(500.0)
    contaPoupanca.deposita(500.0)

    println("Saldo ${contaCorrente.saldo}")
    println("Saldo ${contaPoupanca.saldo}")
    println()

    contaCorrente.saca(10.0)
    contaPoupanca.saca(10.0)
    println("Valor após saque...")
    println("Saldo ${contaCorrente.saldo}")
    println("Saldo ${contaPoupanca.saldo}")
    println()

    contaCorrente.transfere(50.0, contaPoupanca)
    println("Valor após trasferencia de R$50,00")
    println("Saldo ${contaCorrente.saldo}")
    println("saldo ${contaPoupanca.saldo}")
}