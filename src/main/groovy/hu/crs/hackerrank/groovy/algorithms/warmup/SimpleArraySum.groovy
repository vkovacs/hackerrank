package hu.crs.hackerrank.groovy.algorithms.warmup

//https://www.hackerrank.com/challenges/simple-array-sum

def sum(String[] strings) {
    strings.collect {it.toInteger()}.sum()
}

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
Integer size = Integer.parseInt(br.readLine())
String numbersString = br.readLine()
String[] splittedNumbers = numbersString.split(" ")

def result = sum(splittedNumbers)
println result
result