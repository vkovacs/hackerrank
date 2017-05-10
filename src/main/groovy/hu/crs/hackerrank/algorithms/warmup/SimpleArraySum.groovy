package hu.crs.hackerrank.algorithms.warmup


def sum(String[] strings) {
    Integer sum = 0;
    for (String stringNumber : strings) {
        sum += stringNumber.toInteger()
    }
    sum
}

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
Integer size = Integer.parseInt(br.readLine())
String numbersString = br.readLine()
String[] splittedNumbers = numbersString.split(" ")

def result = sum(splittedNumbers)
assert result == 9
resutl