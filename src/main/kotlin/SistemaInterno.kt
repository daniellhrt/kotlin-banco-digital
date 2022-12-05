class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica((senha))){
            println("Autenticação com sucesso")
        } else {
            println("Falha na autenticação")
        }

    }


}