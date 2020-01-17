from django.http import HttpResponse
from django.shortcuts import render

def home(requests):
#	return HttpResponse('<h1> hello world </h1>')
	return render(requests, 'home.html', {'city':'hyderabad', 'company':'deloitte'})

def niit(requests):
	return HttpResponse('NIIT 4A')

def count(request):
	data = request.GET['full']
	listw = data.split()
	wordict = {}
	for word in listw:
		if word in wordict:
			wordict[word] += 1
		else:
			wordict[word] = 1
	return render(request, 'count.html', {'dataone':data, 'len':len(listw), 'wordict':wordict.items()})
