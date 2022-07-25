def solution(n, plans, clients):
    answer = []
    c = []
    p = []
    temp = []
    index = 0
    
    for i in range(len(clients)):
        answer.append(0)

    for i in plans:
        temp = i.split()
        p.append(temp)
    
    for i in clients:
        c = i.split()

        for j in range(len(p)):
            if int(c[0]) <= int(p[j][0]):
                flag = 1
                for k in range(1, len(c)):
                    if c[k] not in p[j]:
                        break
                        flag = 0
                
                if flag == 1:
                    answer[index] = (j + 1)
                    break
        
        index += 1
        
    return answer

print(solution(5, ["100 1 3", "500 4", "2000 5"], ["3000 3 5", "1500 1", "100 1 3", "50 1 2"]))