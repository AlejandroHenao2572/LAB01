# **LAB01**
Integrantes:  
-David Alejandro Patacon Henao    
-Daniel Felipe Hueso Rueda

### PARTE 1
1. Crea un repositorio localmente.  
<img width="1066" height="63" alt="image" src="https://github.com/user-attachments/assets/af17702b-5e8c-4377-8ab6-1d56dfec2eeb" />

2. Agrega un archivo de ejemplo al repositorio, el README.md puede ser una gran opción.  
<img width="774" height="144" alt="image" src="https://github.com/user-attachments/assets/754e95f1-5cd0-4f79-8c3d-529a3ab532fd" />

3. Para que sirven los comandos git add y git commit -m “mensaje”?:  

git add archivo.txt        # Agrega un archivo especifico  
git add .                  # Agrega TODOS los cambios en la carpeta actual  
git commit -m "Mensaje descriptivo" # Guardar esos cambios localmente 

5. Crea un repositorio en blanco (vacío) e GitHub.  
<img width="1647" height="757" alt="image" src="https://github.com/user-attachments/assets/5be08b1d-267d-4a11-b756-75e83e49788f" />

6. Configura el repositorio local con el repositorio remoto.
7. Sube los cambios, teniendo en cuenta lo que averiguaste en el punto 3 Utiliza los siguientes comando en el directorio donde tienes tu proyecto, en este orden.
8. Configura el correo en git local de manera correcta
<img width="1337" height="518" alt="image" src="https://github.com/user-attachments/assets/4af08583-edb5-41a3-93e3-2e227ca15404" />

   
9. Vuelve a subir los cambios y observa que todo esté bien en el repositorio remoto
<img width="1077" height="462" alt="image" src="https://github.com/user-attachments/assets/34149d83-c7d8-484e-aa60-c90d80498bed" />

---
### PARTE 2

1. Se escogen los roles para trabajar en equipo, una persona debe escoger ser "Owner" o Propietario del repositorio y la otra "Collaborator" o Colaborador en el repositorio.  
Integrantes:    
-David Alejandro Patacon Henao  
-Daniel Felipe Hueso Rueda  

3. El owner agrega al colaborador con permisos de escritura en el repositorio que creó en la parte 1  
4. El owner le comparte la url via Teams al colaborador  
5. El colaborador acepta la invitación al repositorio  
<img width="279" height="115" alt="image" src="https://github.com/user-attachments/assets/38107d70-18de-42f6-9d3b-e204b1b268e8" />

6. ¿Que sucedió?  
Al subir los cambios en el README y hacer push al mismo tiempo, solo se subieron los cambios de uno de los nosotros. Al otro le aparecio un error donde decia que no ese estaba trabajando con la version actual.

7. La persona que perdió la competencia de subir los cambios, tiene que resolver los conflictos, cúando haces pull de los cambios, los archivos tienen los símbolos <<< === y >>> (son normales en la resolución de conflictos), estos conflictos debes resolverlos manualmente.  
<img width="975" height="218" alt="image" src="https://github.com/user-attachments/assets/33f04f6d-8e1d-4b13-a1c7-27433307fa97" />

8. Volver a repetir un cambio sobre el README.md ambas personas al tiempo para volver a tener conflictos.  
9. Resuelvan el conflicto con IntelliJ si es posible  
Resolvimos el conflicto con VisualStudioCode  
<img width="975" height="249" alt="image" src="https://github.com/user-attachments/assets/6a932b18-aad4-4cc2-afd2-d860b192d291" />

---
## PARTE 3
1. ¿Hay una mejor forma de trabajar con git para no tener conflictos?    
   Se pueden seguir las siguientes buenas practicas en git para evitar conflictos y trabajar de una mejor forma:  
   -Actualiza antes de trabajar: git pull origin main.  
   -Trabaja en ramas: git checkout -b feature/nueva-funcion.    
   -Commits pequeños y claros: git commit -m "Mensaje"    
   -Evita editar lo mismo que otros, coordinacion en equipo.    
   -Usa rebase para mantenerse al dia: git fetch origin + git rebase origin/main  
   -Resolver conflictos pronto y no dejar que se acumulen.  
   -Integra con Pull Requests para revisión y control.  
   
3. ¿Qué es y como funciona el Pull Request?
4. Creen una rama cada uno y suban sus cambios














