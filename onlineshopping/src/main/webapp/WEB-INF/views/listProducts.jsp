<div class ="container">

<div class="row">
<!-- FIRST WOULD BO TO DISPLAY SIDEBAR -->

<div class="col-md-3">

<%@include file="./shared/sidebar.jsp" %>

</div>

<!--SECOND ONE TO DISPLAY THE ACTUAL PRODUCT  -->

<div class="col-md-9">
<!--9 and 3 total is 12 hai iss tarha hmara bootstrap 2 grid me divide ho gya   -->
<!-- ham bootstrap ka breaadcrumb component use kar rahe hai /home/category/mobile
<!--  ADDING BREADCRUMB COMPONENT OF BOOTSTRAP-->

<div class ="row">
<div class="col-lg-12">
<c:if test="${userClickAllProducts==true}">
<ol class="breadcrumb">
<li><a href="${contextRoot}/home">Home</a></li>
<li class="active">All Products</li>
</ol>
</c:if>



<c:if test="${userClickCategoryProducts==true}">
<ol class="breadcrumb">
<li><a href="${contextRoot}/home">Home</a></li>
<li class="active">Category</li>
<li class="active">${category.name}</li>
</ol>
</c:if>


</div>
</div>


</div>

</div>



</div>