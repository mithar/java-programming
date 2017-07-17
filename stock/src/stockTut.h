


#define STOCKTUT_H_
#include <iostream>
#include <cmath>
using namespace std;

int main(){
	double a;
	double principle = 10000;
	double rate = 0.01;

	for(int day = 1;day <= 20;  day++ ){

		a = principle*pow(1+rate, day);
		cout<< day << "-----" << a << endl;


	}
}

