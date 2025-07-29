frutas = ["Maçã", "Manga", "Uva", "Banana"]

#Mudando itens e acrescentando itens no final
frutas[1] = "Morango"
frutas.append("Abacaxi")

print(frutas)
print("////////////////////////")

#Mudando dois itens ao mesmo tempo (só vai mudar o index 1 e 2, o 3 não conta)
frutas[1:3] = ["Abacaxi", "Abacate"]
print(frutas)

#Substitui somente um index (1, não conta o 2) por 2 itens
frutas[1:2] = ["Goiaba", "Pêra"]
print(frutas)

#Substitui no local que você quer (primeiro o index depois o item)
frutas.insert(2, "Laranja")
print(frutas)