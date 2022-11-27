new Vue({
    el:'#vue',
    data:{
        title:'Tabela',
        data:[]
    },
    methods:{

    }
})

async function products(){
    const url = 'http://localhost:8080/products'
    const config = {
            method:'GET',
            mode:'cors',
            cache:'default',
            status:200
    }
  await fetch(url,config)
                .then(responseEntity => responseEntity.json())
                .then(responseEntity =>{
                    responseEntity.map(product =>{
                        let codBkd = product.cod
                        let nameBkd  = product.name
                        let priceBkd = product.price
                        let validadeBkd = product.validade

                        let codList = document.createElement('ul')
                        let nameList = document.createElement('ul')
                        let priceList = document.createElement('ul')
                        let validadeList = document.createElement('ul')

                        let cod = document.getElementById('cod')
                        let name = document.getElementById('name')
                        let price = document.getElementById('price')
                        let validade = document.getElementById('validade')

                        codList.append(codBkd)
                        cod.append(codList)
                        
                        nameList.append(nameBkd)
                        name.append(nameList)

                        priceList.append(priceBkd)
                        price.append(priceList)

                        validadeList.append(validadeBkd)
                        validade.append(validadeList)
                    })
                }).catch(err =>{
                    alert('Error 500: connection is failed')
                })
} 

products()