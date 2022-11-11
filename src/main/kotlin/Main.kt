fun main() {
    print(caesarCipher("www.abc.xy", 87))
}

fun caesarCipher(s: String, k: Int): String {
    var tempString = ""
    for (i in s.indices) {

        val result: Int = encrypt(s[i].code, k, if (s[i].code in 97..122) 97 else if (s[i].code in 65..90) 65 else 0)

        tempString += result.toChar()
    }
    return tempString
}

fun encrypt(int: Int, k: Int, identifier: Int): Int {
    if (identifier == 0)
        return int
    var result = int - identifier + 26 + k
    if (result > 26) {
        result %= 26
        result += identifier
    }
    return result
}