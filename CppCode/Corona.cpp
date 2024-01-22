#include<iostream>
class SARS{
	public:
		void lockdown(){
			std::cout<<"Lockdown\n";
		}

};
int main(){
SARS s;
s.lockdown();
return 0;
}
