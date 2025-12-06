# EstudosLeetCode_POO

# 📘 Exercícios de Lógica em Kotlin – Estruturas de Dados e Algoritmos

Este repositório contém uma coleção de exercícios resolvidos em **Kotlin**, focados em lógica de programação, estruturas de dados e problemas clássicos encontrados em plataformas como o **LeetCode**.

Os exercícios estão organizados por nível e cada arquivo `.kt` representa a solução de um problema específico, com o objetivo de aprimorar raciocínio lógico, uso de collections em Kotlin e boas práticas de programação.

---

## 🔹 Nível 1 — Arrays e Hashing (Fundamentos)

### **1. Two Sum (Soma de Dois)**

**Conceitos:** Arrays, HashMap

**Descrição:** Dado um array de inteiros e um valor alvo (`target`), retorne os índices dos dois números cuja soma resulte exatamente no alvo.

**Habilidades trabalhadas:** uso de `HashMap`, `forEachIndexed`, criação de soluções eficientes com O(n).

---

### **2. Contains Duplicate (Contém Duplicata)**

**Conceitos:** Set (Conjuntos)

**Descrição:** Verifique se um array contém elementos repetidos.

**Habilidades trabalhadas:** uso de `toHashSet()`, comparação entre `size` e `distinct().size`, pensamento matemático simples.

---

### **3. Valid Anagram (Anagrama Válido)**

**Conceitos:** Strings, Contagem de frequência

**Descrição:** Verifica se duas strings são anagramas — ou seja, possuem exatamente as mesmas letras com as mesmas quantidades.

**Habilidades trabalhadas:** uso de `groupingBy`, `eachCount`, comparação de mapas.

---

## 🔹 Nível 2 — Ponteiros e Manipulação de Strings

### **4. Valid Palindrome (Palíndromo Válido)**

**Conceitos:** Two Pointers, limpeza de string, regex

**Descrição:** Determina se uma string é um palíndromo desconsiderando caracteres especiais e diferenças entre maiúsculas/minúsculas.

**Habilidades trabalhadas:** `filter`, `isLetterOrDigit`, `lowercase()`, ponteiros (início e fim).

---

### **5. Two Sum II — Array Ordenado**

**Conceitos:** Two Pointers

**Descrição:** Versão otimizada do Two Sum, considerando que o array já está ordenado. A solução deve utilizar apenas memória constante.

**Habilidades trabalhadas:** lógica de ponteiros móveis (`left` e `right`), busca eficiente em O(n).

---

## 🔹 Nível 3 — Estruturas de Dados Clássicas

### **6. Valid Parentheses (Parênteses Válidos)**

**Conceitos:** Stack (Pilha)

**Descrição:** Verifica se uma string contendo caracteres como `()`, `{}`, `[]` é válida (cada abertura possui o fechamento correto na ordem adequada).

**Habilidades trabalhadas:** uso de `ArrayDeque`, entendimento de LIFO (Last In, First Out), validação de pares.

---

## 📁 Estrutura dos Arquivos

Cada exercício possui seu próprio arquivo dentro da pasta:

```
src/main/kotlin/exercicios/
```

Exemplo:

```
TwoSum.kt
ContainsDuplicate.kt
ValidAnagram.kt
ValidPalindrome.kt
TwoSumII.kt
ValidParentheses.kt
```

---

## 🎯 Objetivo do Repositório

* Desenvolver raciocínio lógico
* Praticar Kotlin com problemas reais
* Aprender a usar estruturas de dados como **arrays, sets, maps e stacks**
* Preparar para entrevistas de estágio, trainee e vagas júnior

---

## ✔️ Tecnologias Utilizadas

* **Kotlin** (principal)
* Uso de coleções (`List`, `Set`, `Map`)
* Estruturas algorítmicas básicas

---

## 🚀 Contribuições

Sinta-se à vontade para sugerir melhorias, adicionar novas soluções ou otimizações!

---

## 📄 Licença

Este repositório é de uso educacional e aberto para estudos.
