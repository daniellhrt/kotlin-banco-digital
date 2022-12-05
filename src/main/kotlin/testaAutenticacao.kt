fun testaAutenticacao() {
    val gerente = Gerente(
        "daniel",
        "000-000-000.11",
        1000.0,
        1234
    )

    val diretora = Diretor(
        "fernanda",
        "000-000-000.22",
        3000.0,
        1122,
        500.0
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1111)
    sistema.entra(diretora, 1122)
}