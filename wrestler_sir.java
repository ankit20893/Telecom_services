package wrestling;
import java.util.*;
public class wrestler_sir {
private String name;
private int rank;
private double height;
private double weight;
private int matchesWon;
private int matchesLost;
private int totalMatches;
public wrestler_sir(String name, int rank, double height, double weight, int matchesWon, int matchesLost, int totalMatches)
{
	this.name=name;
	this.rank=rank;
	this.height=height;
	this.weight=weight;
	this.matchesWon=matchesWon;
	this.matchesLost=matchesLost;
	this.totalMatches=matchesWon+matchesLost;
}
public void display()
{
System.out.println(this.name);
System.out.println(this.rank);
System.out.println(this.height);
System.out.println(this.weight);
System.out.println(this.matchesWon);
System.out.println(this.matchesLost);
System.out.println(this.totalMatches);
}
public int rank1(){
	return this.rank;
}
public double height1(){
	return this.height;
}
public double weight1(){
	return this.weight;
}
public int matchesWon1(){
	return this.matchesWon;
}
public int matchesLost1(){
	return this.matchesLost;
}
public int totalMatches1(){
	return this.totalMatches;
}
}
