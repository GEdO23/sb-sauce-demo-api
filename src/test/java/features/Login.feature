#language: pt

@Login
Funcionalidade: Login
	
	@LoginValido 
	Cenario: Login com credenciais validas
		Dado que estou na tela de login
		Quando entro com credenciais validas
		Entao entro na pagina de inventario
		
	@LoginInvalido
	Cenario: Login com usuario invalido
		Dado que estou na tela de login
		Quando entro com usuario invalido
		Entao vejo a mensagem de erro
			
	@LoginInvalido
	Cenario: Login com senha invalida
		Dado que estou na tela de login
		Quando entro com senha invalida
		Entao vejo a mensagem de erro
	
	@LogoutSucesso
	Cenario: Sair da conta do usuario
		Dado que estou logado
		Quando clico em logout
		Entao vejo a mensagem de erro
