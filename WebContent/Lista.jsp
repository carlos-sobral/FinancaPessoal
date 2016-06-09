<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Bootstrap Admin Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <a class="navbar-brand" href="index.html">Financa Pessoal</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
               
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                  <li>
                    	<a href="lista-entrada"><i class="fa fa-fw fa-table"></i> Entradas </a>
         	        </li>
                    <li>
                    	<a href="addCategorias.jsp"><i class="fa fa-fw fa-table"></i> Cadastro de Categorias</a>
                   	</li>
                    <li>
                    	<a href="lista-categoria"><i class="fa fa-fw fa-table"></i> Cadastro de Entradas</a>
                   	</li>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

		<div id="page-wrapper">

					<div class="container-fluid">

					   <div class="row">
							<div class="col-sm-12">
								<h2>Bordered Table</h2>
								<div class="table-responsive">
									<table class="table table-bordered table-hover">
										<thead>
											<tr>
												<th>valor</th>
												<th>comentario</th>
												<th>categoria</th>
												<th>frequente</th>
												<th>dataEfetiva</th>
												<th>dataReferencia</th>
											</tr>
										</thead>
										<tbody>
											<jsp:useBean id="entrada" class="dominio.Entrada"/>
											<c:forEach var="entrada" items="${listaEntradas}">
												<tr>
													<td>${entrada.valor}</td>
													<td>${entrada.comentario}</td>
													<td>${entrada.categoria.descricao}</td>
												<!--	<td>${entrada.dataEfetiva}</td>-->
												<!--	<td>${entrada.dataReferencia}</td>-->
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>

						</div>
							

					</div>
					<!-- /.container-fluid -->

		</div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>
