# API使用说明

## ParkingBoy

### 获取所有parkingBoy
- url:`/parkingBoys`
- method:GET
- res:返回所有parkingBoy，格式如下
```
[
    {
        "id": 1,
        "size": 2,
        "remain": 3,
        "parkingBoyId": 1
    },
    {
        "id": 2,
        "size": 2,
        "remain": 3,
        "parkingBoyId": 1 
    }    
]

```

### 获取某一个parkingBoy
- url:`/parkingBoys/{id}`
- method:GET
- req:id
- res:返回查询的对象，格式如下
```
[
    {
        "id": 1,
        "size": 2,
        "remain": 3,
        "parkingBoyId": 1
    }
]

```

### 添加一个parkingBoy
- url:`/parkingBoys`
- method:POST
- headers:Content-Type:application/json
- req:在body里面以json格式传参,格式如下
```
body{
        "id": 1,
        "size": 2,
        "remain": 3,
        "parkingBoyId": 1   
}
```
- res:返回当前添加成功的对象，格式如下
```
    {
        "id": 1,
        "size": 2,
        "remain": 3,
        "parkingBoyId": 1
    }
```


## ParkingLot

### 获取所有parkingLot
- url:`/parkingBoys`
- method:GET
- res:返回所有的parkingLot
```
[
    {
        "id": 1
    },
    {
        "id": 2
    }
]
```

### 获取某一个parkingLot
- url:`/parkingLots/{id}`
- method:GET
- req；id
- res：返回查询对象
```
{
    "id": 1
}
```

### 添加一个parkingLot
- url:`/parkingLots`
- method:POST
- headers:Content-Type:application/json
- req:在body里面以json格式传参,格式如下
```
body{
        "id": 1,   
}
```
- res:返回当前添加成功的对象，格式如下
```
    {
        "id": 1,
    }
```

### 修改parkingLot的id，可用于安排某个parkingLot给parkingBoy管理
- url:`/parkingLots`
- method:PUT
- code:
- req:在body里面以json格式传参,格式如下
```
body{
        "id": 2,
        "size": 2,
        "remain": 3,
        "parkingBoyId": 1   
}
```
- res:返回当前添加成功的对象，格式如下
```
    {
        "id": 2,
        "size": 2,
        "remain": 3,
        "parkingBoyId": 1
    }
```
