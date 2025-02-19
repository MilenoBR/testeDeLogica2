fun main() {
    println(calcularNivel(106, 23)) // Teste com valores positivos
    println(calcularNivel(-5, 10))  // Teste com entrada inválida
}

fun calcularNivel(vitorias: Int, derrotas: Int): String {
    if (vitorias < 0 || derrotas < 0) {
        return "Erro: Vitórias e derrotas não podem ser números negativos."
    }

    val saldoVitorias = vitorias - derrotas
    val nivel = when {
        vitorias < 10 -> "Ferro"
        vitorias in 11..20 -> "Bronze"
        vitorias in 21..50 -> "Prata"
        vitorias in 51..80 -> "Ouro"
        vitorias in 81..90 -> "Diamante"
        vitorias in 91..100 -> "Ascendente"
        vitorias in 101..200 -> "Imortal"
        vitorias in 201..300 -> "Radiante"
        else -> "Rank máximo atingido!"
    }
    return "O herói tem um saldo de $saldoVitorias vitórias e está no nível $nivel."
}
