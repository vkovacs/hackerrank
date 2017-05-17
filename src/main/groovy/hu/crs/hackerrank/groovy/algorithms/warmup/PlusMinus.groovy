package hu.crs.hackerrank.groovy.algorithms.warmup

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

/**
 * https://www.hackerrank.com/challenges/plus-minus
 */

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
BigInteger count = br.readLine().toBigInteger()
List<BigInteger> bigIntegers = br.readLine().split(" ").collect { it.toBigInteger() }

DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance();
decimalSymbols.setDecimalSeparator('.' as char)

DecimalFormat decimalFormat = new DecimalFormat("0.000000", decimalSymbols)

println decimalFormat.format(bigIntegers
        .count { it > 0 }
        .collect { it / count }
        .get(0))

println decimalFormat.format(bigIntegers
        .count { it < 0 }
        .collect { it / count }
        .get(0))

println decimalFormat.format(bigIntegers
        .count { it == 0 }
        .collect { it / count }
        .get(0))