package ru.fewizz;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class MyBenchmark {

    @Benchmark
    public void fib(Blackhole bh) {
        bh.consume(Fibonacci.fib(60));
    }

    @Benchmark
    public void fibObfuscated(Blackhole bh) {
        bh.consume(FibonacciObfuscated.fib(60));
    }

}
