#include<stdio.h>

int ar[100001];
int n;
void query1(int id,int value){
    
    
}

long long query2(int l,int r){

    
}

int main(){
    int q;
    scanf("%d %d",&n,&q);
    for(int i=0;i<n;i++)scanf("%d",&ar[i]);
    while(q--){
        int type,x,y;
        scanf("%d %d %d",&type,&x,&y);
        if(type==1)query1(x,y);
        else printf("%lld\n",query2(x,y));
    }
   return 0; 
}
