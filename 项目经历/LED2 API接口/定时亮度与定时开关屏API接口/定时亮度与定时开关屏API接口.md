[toc]
# 定时亮度与定时开关屏API接口
## 定时亮度任务

### 根据ID查询定时亮度任务
- 概述：此接口用来根据任务ID查询单个定时亮度任务
- 接口定义：http：// [域名]/app/led2task/[version]/queryOneTimedBrightness  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 定时亮度任务ID | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时亮度任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| type | String | 任务类型（3：定时开关屏任务 4：定时亮度任务） |
| name | String | 定时亮度任务名称 |
| brightness | String | 定时亮度任务的亮度(取值范围：1-255之间) |
| devList | JsonArray | 任务关联设备ID |
| taskStatus | String | 任务状态(0：关闭任务 1：开启任务) |
| dateType | String | 日期类型(枚举类型：Range，All) |
| startDate | String | 开始日期(yyyy-MM-dd) |
| endDate | String | 结束日期(yyyy-MM-dd) |
| timeType | String | 时间类型(枚举类型：Range，All)  |
| startTime | String | 开始时间(HH:mm) |
| endTime | String | 结束时间(HH:mm) |
| filterType | String | 星期类型(枚举类型：All，None) |
| weekFilter | JsonArray | 任务执行的星期(1-7) |
| monthFilter | JsonArray | 任务执行的月份(1-12)) |


- 输出json格式
```json
{
    "code":200,
    "data":{
        "endDate":"",
        "monthFilter":[

        ],
        "timeType":"All",
        "type":"4",
        "weekFilter":[

        ],
        "dateType":"All",
        "brightness":"30",
        "name":"test",
        "devList":[
            "5cb695cbf22affbf32eca9a4"
        ],
        "startTime":"",
        "id":"5cc12e366c11524a447cd0af",
        "endTime":"",
        "filterType":"None",
        "startDate":"",
        "taskStatus":1
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 分页查询定时亮度任务
- 概述：此接口用来分页查询全部定时亮度任务
- 接口定义：http：// [域名]/app/led2task/[version]/queryTimedBrightness  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数（单页数量小于等于100条） | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| tasks | jsonArray | 任务数组 |
| total | Long | 任务总数 |

- tasks输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时亮度任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| type | String | 任务类型（3：定时开关屏任务 4：定时亮度任务） |
| name | String | 定时亮度任务名称 |
| brightness | String | 定时亮度任务的亮度(取值范围：1-255之间) |
| devList | JsonArray | 任务关联设备ID |
| taskStatus | String | 任务状态(0：关闭任务 1：开启任务) |
| dateType | String | 日期类型(枚举类型：Range，All) |
| startDate | String | 开始日期(yyyy-MM-dd) |
| endDate | String | 结束日期(yyyy-MM-dd) |
| timeType | String | 时间类型(枚举类型：Range，All)  |
| startTime | String | 开始时间(HH:mm) |
| endTime | String | 结束时间(HH:mm) |
| filterType | String | 星期类型(枚举类型：All，None) |
| weekFilter | JsonArray | 任务执行的星期(1-7) |
| monthFilter | JsonArray | 任务执行的月份(1-12)) |


- 输出json格式
```json
{
    "code":200,
    "data":{
        "tasks":[
            {
                "endDate":"",
                "monthFilter":[

                ],
                "timeType":"All",
                "type":"4",
                "weekFilter":[

                ],
                "dateType":"All",
                "brightness":"30",
                "name":"test",
                "devList":[
                    "5cb695cbf22affbf32eca9a4"
                ],
                "startTime":"",
                "id":"5cc12e366c11524a447cd0af",
                "endTime":"",
                "filterType":"None",
                "startDate":"",
                "taskStatus":1
            },
            {
                "endDate":"",
                "monthFilter":[

                ],
                "timeType":"Range",
                "type":"4",
                "weekFilter":[

                ],
                "dateType":"All",
                "brightness":"1",
                "name":"调光",
                "devList":[
                    "5c7cdbe4999a0722787d1b36"
                ],
                "startTime":"15:04",
                "id":"5cc7f31c999a072454b3c3d0",
                "endTime":"15:05",
                "filterType":"None",
                "startDate":"",
                "taskStatus":1
            },
            {
                "endDate":"2019-07-04",
                "monthFilter":[

                ],
                "timeType":"All",
                "type":"4",
                "weekFilter":[
                    "0"
                ],
                "dateType":"Range",
                "brightness":"10",
                "name":"addTest",
                "startTime":"",
                "id":"5d19d0206c11523e78bb1999",
                "endTime":"",
                "filterType":"All",
                "startDate":"2019-07-01",
                "taskStatus":0
            }
        ],
        "total":7
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 添加定时亮度任务
- 概述：此接口用来添加定时亮度任务
- 接口定义：http：// [域名]/app/led2task/[version]/addTimedBrightness  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| name | String | 定时亮度任务名称 | 是 | 是 |
| brightness | String | 定时亮度任务的亮度(取值范围：1-255之间) | 是 | 否 |
| dateType | String | 日期类型(枚举类型：Range，All) | 是 | 否 |
| startDate | String | 开始日期(yyyy-MM-dd) | 当dateType为Range时必填 | 否 |
| endDate | String | 结束日期(yyyy-MM-dd) | 当dateType为Range时必填 | 否 |
| timeType | String | 时间类型(枚举类型：Range，All)  | 是 | 否 |
| startTime | String | 开始时间(HH:mm) | 当timeType为Range时必填 | 否 |
| endTime | String | 结束时间(HH:mm) | 当timeType为Range时必填 | 否 |
| filterType | String | 星期类型(枚举类型：All，None) | 是 | 否 |
| weekFilter | String | 任务执行的星期(1-7) | 当filterType为All时必填 | 否 |


- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时亮度任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| type | String | 任务类型（3：定时开关屏任务 4：定时亮度任务） |
| name | String | 定时亮度任务名称 |
| brightness | String | 定时亮度任务的亮度(取值范围：1-255之间) |
| taskStatus | String | 任务状态(0：关闭任务 1：开启任务) |
| schedules | JsonObject | 定时亮度任务数据 |

- schedules输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| lng | String | 语言标识 |
| devList | JsonArray | 任务关联设备ID |
| dateType | String | 日期类型(枚举类型：Range，All) |
| startDate | String | 开始日期(yyyy-MM-dd) |
| endDate | String | 结束日期(yyyy-MM-dd) |
| timeType | String | 时间类型(枚举类型：Range，All)  |
| startTime | String | 开始时间(HH:mm) |
| endTime | String | 结束时间(HH:mm) |
| filterType | String | 星期类型(枚举类型：All，None) |
| weekFilter | JsonArray | 任务执行的星期(1-7) |
| monthFilter | JsonArray | 任务执行的月份(1-12)) |

- 输出json格式
```json
{
    "code":200,
    "data":{
            "name":"13",
            "id":"5d5128d4560d65161c111380",
            "brightness":11,
            "type":"4",
            "taskStatus":0,
            "schedules":{
                "dateType":"All",
                "lng":"zh-CH",
                "endDate":"",
                "monthFilter":[

                ],
                "name":"13",
                "timeType":"All",
                "startTime":"",
                "endTime":"",
                "filterType":"All",
                "startDate":"",
                "weekFilter":[
                    "1",
                    "7",
                    "5"
                ]
            }
        }
    "message":"OK",
    "status":"SUCCESS"
}
```

### 修改定时亮度任务
- 概述：此接口用来更新定时亮度任务
- 接口定义：http：// [域名]/app/led2task/[version]/updateTimedBrightness  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |
| name | String | 定时亮度任务名称 | 否 | 是 |
| brightness | String | 定时亮度任务的亮度(取值范围：1-255之间) | 否 | 否 |
| dateType | String | 日期类型(枚举类型：Range，All) | 否 | 否 |
| startDate | String | 开始日期(yyyy-MM-dd) | 当dateType为Range时必填 | 否 |
| endDate | String | 结束日期(yyyy-MM-dd) | 当dateType为Range时必填 | 否 |
| timeType | String | 时间类型(枚举类型：Range，All)  | 否 | 否 |
| startTime | String | 开始时间(HH:mm) | 当timeType为Range时必填 | 否 |
| endTime | String | 结束时间(HH:mm) | 当timeType为Range时必填 | 否 |
| filterType | String | 星期类型(枚举类型：All，None) | 否 | 否 |
| weekFilter | String | 任务执行的星期(1-7) | 当filterType为All时必填 | 否 |


- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时亮度任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| name | String | 定时亮度任务名称 |
| brightness | String | 定时亮度任务的亮度(取值范围：1-255之间) |
| schedules | JsonObject | 定时亮度任务数据 |

- schedules输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| lng | String | 语言标识 |
| name | String | 定时亮度任务名称 |
| devList | JsonArray | 任务关联设备ID |
| dateType | String | 日期类型(枚举类型：Range，All) |
| startDate | String | 开始日期(yyyy-MM-dd) |
| endDate | String | 结束日期(yyyy-MM-dd) |
| timeType | String | 时间类型(枚举类型：Range，All)  |
| startTime | String | 开始时间(HH:mm) |
| endTime | String | 结束时间(HH:mm) |
| filterType | String | 星期类型(枚举类型：All，None) |
| weekFilter | JsonArray | 任务执行的星期(1-7) |
| monthFilter | JsonArray | 任务执行的月份(1-12)) |

- 输出json格式
```json
{
    "code":200,
    "data":{
        "name":"14",
        "id":"5d5128d4560d65161c111380",
        "brightness":"12"
        "schedules":{
            "dateType":"All",
            "lng":"zh-CH",
            "endDate":"",
            "monthFilter":[

            ],
            "name":"14",
            "timeType":"All",
            "startTime":"",
            "endTime":"",
            "filterType":"All",
            "startDate":"",
            "weekFilter":[
                1,
                7,
                5
            ]
        }
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 删除定时亮度任务
- 概述：此接口用来删除定时亮度任务
- 接口定义：http：// [域名]/app/led2task/[version]/deleteTimedBrightness  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |

- 输出json格式
```json
{
    "code":200,
    "message":"OK",
    "status":"SUCCESS"
}
```

### 开启定时亮度任务
- 概述：此接口用来开启定时亮度任务
- 接口定义：http：// [域名]/app/led2task/[version]/openTimedBrightness  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |
| brightness | String | 开始任务后的屏幕亮度 | 是 | 否 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时亮度任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| task_status | Integer | 任务状态 |
| success | Array | 成功下发指令的设备ID |
| fail | Array | 不成功下发指令的设备ID |

- 输出json格式
```json
{
    "code":200,
    "data":{
        "fail":[

        ],
        "task_status":1,
        "id":"5d53d08cf22affaa5d7953d9",
        "success":[
            "5d3818626c115218f829bf76"
        ]
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 关闭定时亮度任务
- 概述：此接口用来关闭定时亮度任务
- 接口定义：http：// [域名]/app/led2task/[version]/closeTimedBrightness  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |
| brightness | String | 关闭任务后的屏幕亮度 | 是 | 否 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时亮度任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| task_status | Integer | 任务状态 |
| success | Array | 成功下发指令的设备ID |
| fail | Array | 不成功下发指令的设备ID |

- 输出json格式
```json
{
    "code":200,
    "data":{
        "fail":[

        ],
        "task_status":1,
        "id":"5d53d08cf22affaa5d7953d9",
        "success":[
            "5d3818626c115218f829bf76"
        ]
    },
    "message":"OK",
    "status":"SUCCESS"
}
```
## 定时开关屏任务

### 根据ID查询定时开关屏任务
- 概述：此接口用来根据定时开关屏任务ID查询单个定时开关屏任务
- 接口定义：http：// [域名]/app/led2task/[version]/queryOneSwitchScreen  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 定时开关屏任务ID | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时开关屏任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| type | String | 任务类型（3：定时开关屏任务 4：定时亮度任务） |
| name | String | 定时开关屏任务名称 |
| screenStatus | String | 屏幕状态(0：关闭 1：开启) |
| devList | JsonArray | 任务关联设备ID |
| taskStatus | String | 任务状态(0：关闭任务 1：开启任务) |
| dateType | String | 日期类型(枚举类型：Range，All) |
| startDate | String | 开始日期(yyyy-MM-dd) |
| endDate | String | 结束日期(yyyy-MM-dd) |
| timeType | String | 时间类型(枚举类型：Range，All)  |
| startTime | String | 开始时间(HH:mm) |
| endTime | String | 结束时间(HH:mm) |
| filterType | String | 星期类型(枚举类型：All，None) |
| weekFilter | JsonArray | 任务执行的星期(1-7) |
| monthFilter | JsonArray | 任务执行的月份(1-12)) |


- 输出json格式
```json
{
    "code":200,
    "data":{
        "endDate":"",
        "monthFilter":[

        ],
        "timeType":"All",
        "type":"3",
        "weekFilter":[

        ],
        "dateType":"All",
        "screenStatus":"0",
        "name":"111",
        "devList":[
            "5c7cdbe4999a0722787d1b36",
            "5ccfa715f22aff2add059eb1"
        ],
        "startTime":"",
        "id":"5d43da89cc5c863c20fec845",
        "endTime":"",
        "filterType":"None",
        "startDate":"",
        "taskStatus":0
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 分页查询定时开关屏任务
- 概述：此接口用来分页查询全部定时开关屏任务
- 接口定义：http：// [域名]/app/led2task/[version]/querySwitchScreen  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| skip | String | 跳过条数 | 是 |
| limit | String | 查询条数（单页数量小于等于100条） | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| tasks | jsonArray | 任务数组 |
| total | Long | 任务总数 |

- tasks输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时开关屏任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| type | String | 任务类型（3：定时开关屏任务 4：定时亮度任务） |
| name | String | 定时开关屏任务名称 |
| screenStatus | String | 屏幕状态(0：关闭 1：开启) |
| devList | JsonArray | 任务关联设备ID |
| taskStatus | String | 任务状态(0：关闭任务 1：开启任务) |
| dateType | String | 日期类型(枚举类型：Range，All) |
| startDate | String | 开始日期(yyyy-MM-dd) |
| endDate | String | 结束日期(yyyy-MM-dd) |
| timeType | String | 时间类型(枚举类型：Range，All)  |
| startTime | String | 开始时间(HH:mm) |
| endTime | String | 结束时间(HH:mm) |
| filterType | String | 星期类型(枚举类型：All，None) |
| weekFilter | JsonArray | 任务执行的星期(1-7) |
| monthFilter | JsonArray | 任务执行的月份(1-12)) |


- 输出json格式
```json
{
    "code":200,
    "data":{
        "tasks":[
            {
                "endDate":"2019-04-25",
                "monthFilter":[

                ],
                "timeType":"All",
                "type":"3",
                "weekFilter":[

                ],
                "dateType":"Range",
                "screenStatus":"0",
                "name":"开关屏测试",
                "devList":[
                    "5cb695cbf22affbf32eca9a4"
                ],
                "startTime":"",
                "id":"5cbe7f7c6c11524d3cbd5e00",
                "endTime":"",
                "filterType":"None",
                "startDate":"2019-04-25",
                "taskStatus":0
            },
            {
                "endDate":"",
                "monthFilter":[

                ],
                "timeType":"Range",
                "type":"3",
                "weekFilter":[

                ],
                "dateType":"All",
                "screenStatus":"0",
                "name":"关",
                "devList":[
                    "5ccfa715f22aff2add059eb1",
                    "5cde5bd6f22aff47c9ddbd69"
                ],
                "startTime":"17:51",
                "id":"5cc2d104999a0725cc8b142c",
                "endTime":"17:52",
                "filterType":"None",
                "startDate":"",
                "taskStatus":1
            },
            {
                "endDate":"",
                "monthFilter":[

                ],
                "timeType":"Range",
                "type":"3",
                "weekFilter":[

                ],
                "dateType":"All",
                "screenStatus":"0",
                "name":"开",
                "devList":[
                    "5c7cdbe4999a0722787d1b36"
                ],
                "startTime":"09:53",
                "id":"5cd0e4a4999a0707f8b87ee8",
                "endTime":"09:55",
                "filterType":"None",
                "startDate":"",
                "taskStatus":1
            }
        ],
        "total":7
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 添加定时开关屏任务
- 概述：此接口用来添加定时开关屏任务
- 接口定义：http：// [域名]/app/led2task/[version]/addSwitchScreen  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| name | String | 定时开关屏任务名称 | 是 | 是 |
| dateType | String | 日期类型(枚举类型：Range，All) | 是 | 否 |
| startDate | String | 开始日期(yyyy-MM-dd) | 当dateType为Range时必填 | 否 |
| endDate | String | 结束日期(yyyy-MM-dd) | 当dateType为Range时必填 | 否 |
| timeType | String | 时间类型(枚举类型：Range，All)  | 是 | 否 |
| startTime | String | 开始时间(HH:mm) | 当timeType为Range时必填 | 否 |
| endTime | String | 结束时间(HH:mm) | 当timeType为Range时必填 | 否 |
| filterType | String | 星期类型(枚举类型：All，None) | 是 | 否 |
| weekFilter | String | 任务执行的星期(1-7) | 当filterType为All时必填 | 否 |


- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时开关屏任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| type | String | 任务类型（3：定时开关屏任务 4：定时亮度任务） |
| name | String | 定时开关屏任务名称 |
| taskStatus | String | 任务状态(0：关闭任务 1：开启任务) |
| schedules | JsonObject | 定时开关屏任务数据 |

- schedules输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| lng | String | 语言标识 |
| devList | JsonArray | 任务关联设备ID |
| dateType | String | 日期类型(枚举类型：Range，All) |
| startDate | String | 开始日期(yyyy-MM-dd) |
| endDate | String | 结束日期(yyyy-MM-dd) |
| timeType | String | 时间类型(枚举类型：Range，All)  |
| startTime | String | 开始时间(HH:mm) |
| endTime | String | 结束时间(HH:mm) |
| filterType | String | 星期类型(枚举类型：All，None) |
| weekFilter | JsonArray | 任务执行的星期(1-7) |
| monthFilter | JsonArray | 任务执行的月份(1-12)) |

- 输出json格式
```json
{
    "code":200,
    "data":{
            "name":"13",
            "id":"5d5128d4560d65161c111380",
            "taskStatus":0,
            "type":"3",
            "schedules":{
                "dateType":"All",
                "lng":"zh-CH",
                "endDate":"",
                "monthFilter":[

                ],
                "name":"13",
                "timeType":"All",
                "startTime":"",
                "endTime":"",
                "filterType":"All",
                "startDate":"",
                "weekFilter":[
                    "1",
                    "7",
                    "5"
                ]
            }
        }
    "message":"OK",
    "status":"SUCCESS"
}
```

### 修改定时开关屏任务
- 概述：此接口用来更新定时开关屏任务
- 接口定义：http：// [域名]/app/led2task/[version]/updateTimedBrightness  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |
| name | String | 定时开关屏任务名称 | 否 | 是 |
| dateType | String | 日期类型(枚举类型：Range，All) | 否 | 否 |
| startDate | String | 开始日期(yyyy-MM-dd) | 当dateType为Range时必填 | 否 |
| endDate | String | 结束日期(yyyy-MM-dd) | 当dateType为Range时必填 | 否 |
| timeType | String | 时间类型(枚举类型：Range，All)  | 否 | 否 |
| startTime | String | 开始时间(HH:mm) | 当timeType为Range时必填 | 否 |
| endTime | String | 结束时间(HH:mm) | 当timeType为Range时必填 | 否 |
| filterType | String | 星期类型(枚举类型：All，None) | 否 | 否 |
| weekFilter | String | 任务执行的星期(1-7) | 当filterType为All时必填 | 否 |


- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时开关屏任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| name | String | 定时开关屏任务名称 |
| schedules | JsonObject | 定时开关屏任务数据 |

- schedules输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| lng | String | 语言标识 |
| name | String | 定时开关屏任务名称 |
| devList | JsonArray | 任务关联设备ID |
| dateType | String | 日期类型(枚举类型：Range，All) |
| startDate | String | 开始日期(yyyy-MM-dd) |
| endDate | String | 结束日期(yyyy-MM-dd) |
| timeType | String | 时间类型(枚举类型：Range，All)  |
| startTime | String | 开始时间(HH:mm) |
| endTime | String | 结束时间(HH:mm) |
| filterType | String | 星期类型(枚举类型：All，None) |
| weekFilter | JsonArray | 任务执行的星期(1-7) |
| monthFilter | JsonArray | 任务执行的月份(1-12)) |

- 输出json格式
```json
{
    "code":200,
    "data":{
        "name":"14",
        "id":"5d5128d4560d65161c111380",
        "brightness":"12"
        "schedules":{
            "dateType":"All",
            "lng":"zh-CH",
            "endDate":"",
            "monthFilter":[

            ],
            "name":"14",
            "timeType":"All",
            "startTime":"",
            "endTime":"",
            "filterType":"All",
            "startDate":"",
            "weekFilter":[
                1,
                7,
                5
            ]
        }
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 删除定时开关屏任务
- 概述：此接口用来删除定时开关屏任务
- 接口定义：http：// [域名]/app/led2task/[version]/deleteSwitchScreen  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 定时开关屏任务ID | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |

- 输出json格式
```json
{
    "code":200,
    "message":"OK",
    "status":"SUCCESS"
}
```

### 开启定时开关屏任务
- 概述：此接口用来开启定时开关屏任务
- 接口定义：http：// [域名]/app/led2task/[version]/openSwitchScreen  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时亮度任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| task_status | Integer | 任务状态 |
| success | Array | 成功下发指令的设备ID |
| fail | Array | 不成功下发指令的设备ID |

- 输出json格式
```json
{
    "code":200,
    "data":{
        "fail":[

        ],
        "task_status":1,
        "id":"5d53efdcf22affaa5d7953de",
        "success":[
            "5d3818626c115218f829bf76"
        ]
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 关闭定时开关屏任务
- 概述：此接口用来关闭定时开关屏任务
- 接口定义：http：// [域名]/app/led2task/[version]/closeSwitchScreen  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 定时亮度任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| task_status | Integer | 任务状态 |
| success | Array | 成功下发指令的设备ID |
| fail | Array | 不成功下发指令的设备ID |

- 输出json格式
```json
{
    "code":200,
    "data":{
        "fail":[

        ],
        "task_status":1,
        "id":"5d53efdcf22affaa5d7953de",
        "success":[
            "5d3818626c115218f829bf76"
        ]
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

## 定时亮度/定时开关屏通用任务

### 任务绑定设备
- 概述：此接口使定时亮度/定时开关屏任务绑定设备
- 接口定义：http：// [域名]/app/led2task/[version]/binding  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |
| devId | String | 设备ID | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| devId | String | 设备ID |

- 输出json格式
```json
{
    "code":200,
    "data":{
        "devId":"5cb695cbf22affbf32eca9a4",
        "id":"5d43da89cc5c863c20fec845"
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

### 任务解除绑定设备
- 概述：此接口使定时亮度/定时开关屏任务解除绑定设备
- 接口定义：http：// [域名]/app/led2task/[version]/unbound  
- 请求方式：POST
- 输入格式： 

| 参数 | 类型 | 说明 | 是否必填 | 是否唯一 |
| ------ | ------ | ------ | ------ | ------ |
| id | String | 任务ID | 是 | 是 |
| devId | String | 设备ID | 是 | 是 |

- 输出格式：

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| code | Integer | 状态码 |
| message | String | 返回提示 |
| status | String | 返回状态信息 |
| data | JsonObject | 返回数据 |

- data输出格式

| 参数 | 类型 | 说明 |
| ------ | ------ | ------ |
| id | String | 任务ID（任务唯一标识，可用于查询，删除，更新操作） |
| devId | String | 设备ID |

- 输出json格式
```json
{
    "code":200,
    "data":{
        "devId":"5cb695cbf22affbf32eca9a4",
        "id":"5d43da89cc5c863c20fec845"
    },
    "message":"OK",
    "status":"SUCCESS"
}
```

## 返回状态码
| 参数 | 说明 |
| ------ | ------ |
| 200 | 成功 |
| 20010 | 失败 |
| 400 | 无效请求 |
| 500 | 服务器异常 |
| 20001 | 数据不符合规范 |
| 20002 | 缺少必需参数 |
| 20003 | 参数校验失败 |
| 20004 | 数据不存在 |
| 20005 | 数据已存在 |
| 20006 | 设备离线 |
| 20007 | 设备离线或服务器连接异常 |
| 20008 | 网关服务超时 |

