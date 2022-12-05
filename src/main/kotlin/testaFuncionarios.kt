fun testaFuncionario() {

    val daniel = Analista(
        "Daniel",
        "000-000-000.11",
        1000.0
    )
    println("nome ${daniel.nome}")
    println("cpf ${daniel.cpf}")
    println("salario ${daniel.salario}")
    println("bonificação ${daniel.bonificacao}")

    println("-------------------------------")

    val fernanda = Gerente(
        "fernanda",
        "000-000-000.22",
        2000.0,
        1234
    )
    println("nome ${fernanda.nome}")
    println("cpf ${fernanda.cpf}")
    println("salario ${fernanda.salario}")
    println("bonificação ${fernanda.bonificacao}")

    if (fernanda.autentica(1234)) {
        println("Autenticação com sucesso!")
    } else {
        println("Autenticação falhou!")
    }
    println("-------------------------------")

    val joao = Diretor(
        "joao",
        "000-000-000.33",
        3000.0,
        2222,
        1000.0
    )
    println("nome ${joao.nome}")
    println("cpf ${joao.cpf}")
    println("salario ${joao.salario}")
    println("plr ${joao.plr}")
    println("bonificação ${joao.bonificacao}")

    if (joao.autentica(3333)) {
        println("Autenticação com sucesso!")
    } else {
        println("Autenticação falhou!")
    }

    println("--------------------------------")

    val nanda = Analista(
        "nanda",
        "000-000-000-44",
        5000.0
    )
    println("nome ${nanda.nome}")
    println("cpf ${nanda.cpf}")
    println("salario ${nanda.salario}")
    println("bonificação ${nanda.bonificacao}")

    println("-------------------------------")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(daniel)
    calculadora.registra(fernanda)
    calculadora.registra(joao)
    calculadora.registra(nanda)

    println("Total de bonificação: ${calculadora.total}")
}