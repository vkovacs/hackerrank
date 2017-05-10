package hu.crs.hackerrank.groovy.algorithms.implementation

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
int n = Integer.parseInt(br.readLine())

BigInteger product = 1
(1..n).each { product *= it}
println product