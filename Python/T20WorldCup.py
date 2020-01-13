#!/usr/bin/env python
# coding: utf-8

# In[ ]:


#data initialisation
India = []
Pakistan = []
SriLanka = []
NewZealand = []
Zimbawe = []
Canada = []
Kenya = []
SouthAfrica = []
WestIndies = []
England = []
Bangladesh = []
Irelands = []
Netherlands = []
Bermuda = []
Australia = []
USA = []


lista = [India, Pakistan , SriLanka, NewZealand]
listb= [ Zimbawe, Canada, Kenya, SouthAfrica]
listc = [WestIndies, England, Bangladesh, Irelands]
listd = [Netherlands, Bermuda, Australia, USA]
listp = []
liste=[]
listf=[]
listg=[]


# In[ ]:


#grading system
w =2 
t = 1
l = 0


# In[ ]:


#function to generate fixtures and enter scores
def fixtures (matches):
   
    try:
        for i in range(0,len(matches),1):
            print(matches[i])
            for j in range(i+1,len(matches),1):
                print("vs",matches[j])
                res =  eval(input("Press w for win, t for tie and l for lost **Only for HOME TEAM**"))
                if res == w:
                    matches[i].append(w)
                    matches[j].append(l)
                elif res == l:
                    matches[i].append(l)
                    matches[j].append(w)
                else:
                    matches[i].append(t)
                    matches[j].append(t)
        print("The points are", matches)
        print("\n")
    
    except NameError:
        print("Type 'w' 'l' 't' ONLY")


# In[ ]:


#top two teams qualify from each group where matches = initial group and group = qualifying group
def qualify (matches,group):
    #points = 0 # DO NOT TOUCH ! JUST AN ASSIGNMENT
    listp.clear()
    for i in range(0,len(matches),1):
        listp.append(sum(matches[i]))
        
        

    maxpos1 = listp.index(max(listp))  #winning team
    if(maxpos1==0):
        group.append(matches[0])
    elif (maxpos1==1):
        group.append(matches[1])
    elif (maxpos1==2):
        group.append(matches[2])
    elif (maxpos1==3):
        group.append(matches[3])
        
        
    listp[maxpos1] = 0
       
    maxpos2 = listp.index(max(listp))  #2nd position
    
    if(maxpos2==0):
        group.append(matches[0])
    elif (maxpos2==1):
        group.append(matches[1])
    elif (maxpos2==2):
        group.append(matches[2])
    elif (maxpos2==3):
        group.append(matches[3])
  
               
        
 


# In[ ]:


#finding the final winner
def winner (matches):
    #points = 0 # DO NOT TOUCH ! JUST AN ASSIGNMENT
    listp.clear()
    for i in range(0,len(matches),1):
        listp.append(sum(matches[i]))
        
        

    maxpos1 = listp.index(max(listp))  #winning team
    if(maxpos1==0):
        print("Winner is",matches[0])
    elif (maxpos1==1):
        print("Winner is",matches[1])
    elif (maxpos1==2):
        print("Winner is",matches[2])
    elif (maxpos1==3):
        print("Winner is",matches[3])
        
        
    


# In[ ]:


#function calls
fixtures(lista)
fixtures(listb)
fixtures(listc)
fixtures(listd)
qualify(lista,liste)
qualify(listb,liste)
qualify(listc,listf)
qualify(listd,listf)
fixtures(liste)
fixtures(listf)
qualify(liste,listg)
qualify(listf,listg)
winner(listg)


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




