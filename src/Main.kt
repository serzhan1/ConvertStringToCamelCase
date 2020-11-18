class Main {
    fun toCamelCase(str:String) = str.split(Regex("[\\W_]")).reduceRight{acc,string -> acc + string.capitalize()}
}