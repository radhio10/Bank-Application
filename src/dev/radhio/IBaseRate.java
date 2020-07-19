package dev.radhio;
/**
 * Created by Azmia Hoque Radhio on 7/17/2020.
 */
public interface IBaseRate {
    // Write a method that returns the base rate
    default double getBaseRate(){
        return 2.5;
    }
}
