
fun main() {
    //Parte 1
    val list = listOf(1,2,3,4,5,6,7,8,9,0)
    list.forEach{e -> if (e % 2 != 0) println(e)}

    fun cumprimentar(nome: String): String{
        return "Olá $nome, tudo bem?"
    }
    println(cumprimentar("Allyson"))

    val list2 = listOf("No1", null, "Nom", "Nome3", null, "No2", "Nome5")
    list2.forEachIndexed{ i, e ->
        if (e != null) {
            if(e.length > 4) println(e.let { cumprimentar("$i: "+it) })
        }

    }
//Parte 2
val bob = Cao("bob")
    bob.latir()
    bob.brincar()
}