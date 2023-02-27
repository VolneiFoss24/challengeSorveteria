fun main() {

    val vote = intArrayOf( 0, 2, 3, 4, 4)

    val codigoPopular = popularFlavor(vote)

    println("O sabor mais popular é o código $codigoPopular")
}

//recebe os votos dos participantes
fun popularFlavor(votos: IntArray): Int {

    val count = IntArray(5)

    // percorrendo para incrementar ao codigo de cada voto
    for (voto in votos) {
        count[voto]++
    }

    var codigoPopular = 0
    var countPopular = 0

    for (i in count.indices) {
        if (count[i] > countPopular) {
            codigoPopular = i
            countPopular = count[i]
        }
    }
    return codigoPopular
}