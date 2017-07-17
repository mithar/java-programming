#define RANDNUM_H_
#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main(){
	srand(time(0));
	for(int x = 1; x <27; x++){

		cout<<rand()<<endl;
	}
}


