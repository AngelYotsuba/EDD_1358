import pandas as pd # Pandas (Domador de Datos)

# Este es el lector del csv (Archivo separado por comas)
datos_redes = pd.read_csv('presenciaredes.csv')

# Menus
respuesta_redSocial = int(input('''
  Selecciona una opcion:
                           
    1 - Porcentaje de crecimiento 
    2 - Diferencia de Seguidores de Twitter
    3 - Diferencia de Visualizaciones de Youtube
'''))

if respuesta_redSocial == 1:
    crecimineto_respuesta = int(input('''
  Selecciona la Red social a calcular el porcentaje de crecimiento
    
    1 = Facebook
    2 = Twitter
'''))
    if crecimineto_respuesta == 1:
        prc_total = datos_redes.loc[2, 'ENERO': 'JUNIO']
        pr_ene = float(prc_total[0])
        pr_feb = float(prc_total[1])
        pr_mar = float(prc_total[2])
        pr_abr = float(prc_total[3])
        pr_may = float(prc_total[4])
        pr_jun = float(prc_total[5])
        prc = (pr_ene + pr_feb + pr_mar + pr_abr + pr_may + pr_jun)/6
        print(prc, '% es el crecimiento de Enero a Junio en Facebook')
    elif crecimineto_respuesta == 2:
        prc_total = datos_redes.loc[2, 'ENERO': 'JUNIO']
        pr_ene = float(prc_total[0])
        pr_feb = float(prc_total[1])
        pr_mar = float(prc_total[2])
        pr_abr = float(prc_total[3])
        pr_may = float(prc_total[4])
        pr_jun = float(prc_total[5])
        prc = (pr_ene + pr_feb + pr_mar + pr_abr + pr_may + pr_jun)/6
        print(prc, '% es el crecimiento de Enero a Junio en Twitter')
    else:
        print ('Selecciona solo 1 o 2, intentalo denuevo')
        
elif respuesta_redSocial == 2:
    datos_meses = datos_redes.loc[7, 'ENERO': 'JUNIO']
    datos_1 = int(datos_meses[0])
    datos_2 = int(datos_meses[5])
    total = datos_2 - datos_1
    print(total, 'seguidores mas entre enero y junio')
    
else:
    datos_meses = datos_redes.loc[15, 'ENERO': 'JUNIO']
    ene = int(datos_meses[0])
    feb = int(datos_meses[1])
    mar = int(datos_meses[2])
    abr = int(datos_meses[3])
    may = int(datos_meses[4])
    jun = int(datos_meses[5])
    seleccion_mes1 = int(input('''
  Selecciona el primer mes
    
    1.- Enero
    2.- Febrero
    3.- Marzo
    4.- Abril
    5.- Mayo
    6.- Junio
'''))
    seleccion_mes2 = int(input('''
  Selecciona el segundo mes
    
    1.- Enero
    2.- Febrero
    3.- Marzo
    4.- Abril
    5.- Mayo
    6.- Junio
''')) 
    if seleccion_mes1 == 1:
        if seleccion_mes2 == 1:
            print(ene - ene, 'visualizaciones es la difernecia entre enero y enero')
        elif seleccion_mes2 == 2:
            print(feb - ene, 'visualizaciones es la difernecia entre enero y febrero')
        elif seleccion_mes2 == 3:
            print(mar - ene, 'visualizaciones es la difernecia entre enero y marzo')
        elif seleccion_mes2 == 4:
            print(abr - ene, 'visualizaciones es la difernecia entre enero y abril')
        elif seleccion_mes2 == 5:
            print(may - ene, 'visualizaciones es la difernecia entre enero y mayo')
        else:
            print(jun - ene, 'visualizaciones es la difernecia entre enero y junio')
            
    elif seleccion_mes1 == 2:
        if seleccion_mes2 == 1:
            print(ene - feb, 'visualizaciones es la difernecia entre febrero y enero')
        elif seleccion_mes2 == 2:
            print(feb - feb, 'visualizaciones es la difernecia entre febrero y febrero')
        elif seleccion_mes2 == 3:
            print(mar - feb, 'visualizaciones es la difernecia entre febrero y marzo')
        elif seleccion_mes2 == 4:
            print(abr - feb, 'visualizaciones es la difernecia entre febrero y abril')
        elif seleccion_mes2 == 5:
            print(may - feb, 'visualizaciones es la difernecia entre febrero y mayo')
        else:
            print(jun - feb, 'visualizaciones es la difernecia entre febrero y junio')
            
    elif seleccion_mes1 == 3:
        if seleccion_mes2 == 1:
            print(ene - mar, 'visualizaciones es la difernecia entre marzo y enero')
        elif seleccion_mes2 == 2:
            print(feb - mar, 'visualizaciones es la difernecia entre marzo y febrero')
        elif seleccion_mes2 == 3:
            print(mar - mar, 'visualizaciones es la difernecia entre marzo y marzo')
        elif seleccion_mes2 == 4:
            print(abr - mar, 'visualizaciones es la difernecia entre marzo y abril')
        elif seleccion_mes2 == 5:
            print(may - mar, 'visualizaciones es la difernecia entre marzo y mayo')
        else:
            print(jun - mar, 'visualizaciones es la difernecia entre marzo y junio')
            
    elif seleccion_mes1 == 4:
        if seleccion_mes2 == 1:
            print(ene - abr, 'visualizaciones es la difernecia entre abril y enero')
        elif seleccion_mes2 == 2:
            print(feb - abr, 'visualizaciones es la difernecia entre abril y febrero')
        elif seleccion_mes2 == 3:
            print(mar - abr, 'visualizaciones es la difernecia entre abril y marzo')
        elif seleccion_mes2 == 4:
            print(abr - abr, 'visualizaciones es la difernecia entre abril y abril')
        elif seleccion_mes2 == 5:
            print(may - abr, 'visualizaciones es la difernecia entre abril y mayo')
        else:
            print(jun - abr, 'visualizaciones es la difernecia entre abril y junio')
            
    elif seleccion_mes1 == 5:
        if seleccion_mes2 == 1:
            print(ene - may, 'visualizaciones es la difernecia entre mayo y enero')
        elif seleccion_mes2 == 2:
            print(feb - may, 'visualizaciones es la difernecia entre mayo y febrero')
        elif seleccion_mes2 == 3:
            print(mar - may, 'visualizaciones es la difernecia entre mayo y marzo')
        elif seleccion_mes2 == 4:
            print(abr - may, 'visualizaciones es la difernecia entre mayo y abril')
        elif seleccion_mes2 == 5:
            print(may - may, 'visualizaciones es la difernecia entre mayo y mayo')
        else:
            print(jun - may, 'visualizaciones es la difernecia entre mayo y junio')

    else:
        if seleccion_mes2 == 1:
            print(ene - jun, 'visualizaciones es la difernecia entre junio y enero')
        elif seleccion_mes2 == 2:
            print(feb - jun, 'visualizaciones es la difernecia entre junio y febrero')
        elif seleccion_mes2 == 3:
            print(mar - jun, 'visualizaciones es la difernecia entre junio y marzo')
        elif seleccion_mes2 == 4:
            print(abr - jun, 'visualizaciones es la difernecia entre junio y abril')
        elif seleccion_mes2 == 5:
            print(may - jun, 'visualizaciones es la difernecia entre junio y mayo')
        else:
            print(jun - jun, 'visualizaciones es la difernecia entre junio y junio')