programa
{
	
	funcao inicio()
	{
	real peso
	real excedente
	real multa
	escreva("quantos quilos foram pescados:")
	leia(peso)

	se(peso>50){
		excedente=(peso -50)
		multa=(excedente * 4 )
		escreva("valor da multa:"+excedente)
	}
	senao{
		escreva("0")
	}
	}
}
