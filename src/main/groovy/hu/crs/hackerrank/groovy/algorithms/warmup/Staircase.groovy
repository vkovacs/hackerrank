package hu.crs.hackerrank.groovy.algorithms.warmup

BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def depth = br.readLine().toInteger()

depth.times {
    int step = it + 1
    (depth - step).times {
        print " "
    }
    step.times {
        print "#"
    }
    println ""
}
