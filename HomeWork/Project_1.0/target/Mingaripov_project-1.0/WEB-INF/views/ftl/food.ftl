<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <title>Еда</title>
    <link rel="stylesheet" type="text/css" href="/resources/list.css">
</head>
<body>
<ul class="drop_down_list">
<#list food.foods as food>
    <li>${food.cathegory}</li>
    <li>${food.name}</li>
    <li>${food.cost}</li>
    </#list>
</ul>
</body>