package com.example

import spock.lang.IgnoreRest
import spock.lang.Specification

class SubtractionSpec extends Specification{
    def sub

    void setup(){
        sub=new Subtraction()

    }

    @IgnoreRest
    void "canary test"(){
        println "this is canary test"
        expect:
        true 
    }

    void "Subtraction of two nyumbers"() {
        given:
        def a=Integer.valueOf(8);
        def b=Integer.valueOf(4);
        expect:
        // exercise math method for a few different inputs
        sub.sub(1,3) == 3
        sub.sub(7, 4) == 7
        sub.sub(a,b) == 4
    }

    void "subtraction of two numbers"() {
        given:
        def a=Integer.valueOf(8);
        def b=Integer.valueOf(4);
        when:
        c==sub.sub(a,b);
        then:
        c==4;

    }

    def "subtraction of two numbers, another way"() {
//        setup:
//        def a=1.98;
//        def b=3.28
        expect:
        sub.sub(a, b) == c

        where:
        a | b || c
        1.98 | 3.28 || -1.38

    }
    def "subtraction of two numbers, other way"() {
        setup:
        def a=8;
        def b=4;

        when:
        c==sub.sub(a,b);

        then:
        c==4;


    }

}
