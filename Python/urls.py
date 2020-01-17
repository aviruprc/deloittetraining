
from django.contrib import admin
from django.urls import path
from .import views

urlpatterns = [
    path('admin/', admin.site.urls),
	path('deloitte/', admin.site.urls),
	path('', views.home),
	path('niit/', views.niit),
    path('countxxxx/', views.count,  name='text_count'),
]
