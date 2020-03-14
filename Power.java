package yyy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Power {
	public static void main(String[] args) {
		Train t = new Train();
		System.out.println(t);
		System.out.println(new Train());
		int i = 0;
}
}
	class Train implements Comparable<Train>{
		int number;
		String type;
		String start;
		String dest;
		double price;
		
		public Train(int number, String type, String start, String dest, double price) {
			this.number = number;
			this.type = type;
			this.start = start;
			this.dest = dest;
			this.price = price;
		}
		
		public Train() {
			super();
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getDest() {
			return dest;
		}

		public void setDest(String dest) {
			this.dest = dest;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		
		@Override
		public String toString() {
			return "hello world";
		}

		
		public int hashCode() {//Double應該要用doubleToLongBits但是我懶
			int result = 1, prime = 71;
			result *= prime + number;
			result *= prime + ((type == null)? 0 : type.hashCode());
			result *= prime + ((start == null)? 0 : start.hashCode());
			result *= prime + ((dest == null)? 0 : dest.hashCode());
			result *= prime + (int)price;
			
			return result;
		}

		public boolean equals(Object obj) {
			if(this == obj)return true;
			if(obj == null)return false;
			if(getClass() != obj.getClass())return false;
			Train other = (Train)obj;
			if(dest == null) {
				if(other.dest != null)return false;
			}else if(!dest.equals(other.dest))return false;
			if(number != other.number)return false;
			if(Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))return false;
			if(start == null) {
				if(other.start != null)return false;
			}else if(!start.equals(other.start))return false;
			if(type == null) {
				if(other.type != null)return false;
			}else if(!type.equals(other.type))return false;
			return true;		
		}
		
		public int compareTo(Train train) {
			if(this.number > train.number) {
				return 1;
			}else if(this.number == train.number) {
				return 0;
			}else {
				return -1;
			}
		}
		
	}
