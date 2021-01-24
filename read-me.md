Git - good practices

*commit powinien miec dobry opis
* commit powinien byc zawierac jedna zmiane
* zmiana opisu tylko ostatniego commita(amend)
* podruzuj po histori i branchach tylko przy czystym drzewie roboczym
* zmergowany branch mozna usunac
* fast forward działa tylko w przypadku gdy jeden branch może "dogonić" drugi
* fast forward nie zawsze jest możliwy - działa tylko w przypadku gdy jeden branch może "dogonić" drugi
* zawsze można wymusić commit mergujący


Git - przydatne komendy
git status
git add .
git commit -m "[tag] - message"
git restore --staged  read-me.md  //zdejmuje ze stage
git checkout branch-name // przelacz sie na brach-name
git checkout -b branch-name // przelacz na nowy utworzony branch
