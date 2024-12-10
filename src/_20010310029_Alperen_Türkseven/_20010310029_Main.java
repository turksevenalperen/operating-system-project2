
1 den 100e kadar olan sayıları toplamını bulup sonucu  sonuç değişkenine atayan program

.MODEL SMALL

.STACK 64

.DATA

.CODE
 
ANA PROC FAR

MOV AX,@DATA

MOV DS,AX

MOV AX, 00

MOV CX,100

BAS:
	
	ADD AX,CX
	
	DEC CX
	JNE BAS
	
	
	MOV SONUC,AX
	
	MOV AX 4CH
	
	INT 21H
	ANA ENDP
	ANA END
	


.model small
.stact 100h 

.data


.model small
.stack 100h
.data

bellek db ?
		
		.code
		
		main proc
		mov ax,@data
		mov ds,ax
		
		mov cx ,10
		lea di 





bellek1 dw 80dup(3)
bellek2 dw 80dup(4)
.code

.org 100h

main proc far

mov ax ,@data
mov ds,ax

main proc 

mov cx 	,80

mov bx ,00


process :
	
	mov ax[bellek1 + bx]
			mul word ptr [bellek2+bx]
					mov [bellek2+bx],ax
					
					add bx,2
					loop process
					
					mov ax 4C00H
					
					ınt 21h
					main endp
					end main
					
					
	

.model small
.stack 100h


.data
bellek1 db 80 dup(3)
bellek2 db 80 dup(4)

.code
org 100h

mov ax,@data
mov ds,ax


mov cs,80

mov bx,00


process:
	mov ax,[bellek1+bx]
	add ax,[bellek2+bx]
			
		add ax,2
		
	mov [bellek2+bx],ax
	
	add bx,2
	
	loop prcess
	
	mov ax,4c00h
	int 21h
	
	
	main endp
	end main
	
	
	.main small
	.stack 64
	

	.data
	sonuc dw ?
	
	.code
	
	ana proc far
	
	mov ax,@data
	mov ds,ax
	
	mov cs,100
	
	mov ax,00
	
	
	bas:
		mov bx,cs
	
		mul bx,6 
		
		add ax,bx
		sub cx,2
		jg bas
		
		
		mov sonuc,ax
		
		
		
		
		
		
		ale 1 veri yolunda bilgi gidiyordur 0 veri yolunda hazır bir veri var
		m/ıo 1 hafıza adresı 0 gırışçkış
		dt/r 1 ise iletim modunda 0 ise alma modunda
		
		bhe d8 den d15 e yüksek değerli bitleri etkinleştirir
		
		wr= 1 hafızaya 0 giriş çıkışına veri çıkardığını gösterir
		
		ready 1=slow memory 0 ise giriş çıkış işlemlerinde hazır olduğu 
		
		
		
		bus cyle 8086 mikroişlemcilerinde  veri yolu işlemlerinde zamanlama döngüleri olarak
		kullanır.bu veri yolu döngüleridnde 4 saat darbe vuruşu bulunur.bu döngüde  mikroişlem
		cinin  bellek ve gırışçıkış birimleriyle iletişim kurulur
		veri yolu işlemlerinde şunlar vardır
		hafıza okuma döngüsü hafıza yazma döngüsü ıo yazma ve okuma döngüsü
		
		
		
		mn/mx ucu lojik 1 yapılırsa genel olarak tek işlemci modu çalışır ve mimimum  mod aktıf
		olur
		
		mn mx ucu lojik 0 yapıırsa genel olarak çok işlemcili mod çalışır ve maksimum mod
		aktif olur 
		
		
		
		
		

		
		
		
		
	
	
	
	
	
			
					
















	











	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	