<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <!-- Font awesome -->
    <%@include file="fontawesome/fontawesome.jsp" %> 
    <!-- Bootstrap css and JavaScript links -->
    <%@include file="bootstrap_links.jsp" %>
    <!-- custom css -->
    <link href="css/index.css" rel="stylesheet"/>

    <title>Flavours Hotel</title>
  </head>
 
  <body>
  <%@include file="homeNavbar.jsp" %>
    <section class="bg-dark text-light p-5 pb-2 text-center text-sm-start">
      <div class="container">
        <div class="d-sm-flex">
          <div>
          
            <!-- <img class="img-fluid w-50 ms-auto"   src="hotel.png" alt=""/> -->
          </div>
          <img src="https://image-tc.galaxy.tf/wijpeg-8oittjb5tybr1yhuxw6bvdpn/file.jpg?w=2000&h=975" class="img-fluid" alt="Responsive image">
        </div>
      </div>

    </section>

    <section class="bg-white text-dark p-5 pb-2 text-center text-sm-start">
      <div class="container">
        <div class="d-sm-flex">
          <div>
            <h3>
              <span class="text-warning"> Flavours...</span> Rooms
            </h3>
            <p class="lead my-4">A 200-room luxury urban resort, Flavours Hotel effortlessly blends style with tranquility.  Our rooms feature hardwood floors and a plethora of innovative conveniences such as keyless room entry and app-enabled smart lighting and temperature control</p>
            <br />
              <a class="btn btn-primary btn-lg" href="/Rooms.jsp">VIEW ALL ROOMS</a>
              
            <!-- <img class="img-fluid w-50 ms-auto"   src="hotel.png" alt=""/> -->
          </div>
          
        </div>
      </div>

    </section>
    




    <section class="bg-white text-dark p-5 text-center text-sm-start ms-auto">
      <div class="container">
        <div class="d-sm-flex">
          <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="ms-auto d-none d-sm-block" src="images/executive_room1.jpg" alt="First slide" >
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="images/executive_room2.jpg" alt="Second slide" >
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="images/executive_room3.jpg" alt="Third slide">
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
          <div class="text-sm-start p-4 ms-auto">
            <h3>PREMIUM KING</h3>
            <p class="lead my-4 ">
              290 sq. ft.  |  The comfortable, contemporary design of our spacious Premium King rooms provide a tranquil atmosphere to wind down after a long day. Relax on our King bed with plush mattresses covered with tufted quilts and 100% Egyptian cotton linen. Each room features hardwood floors, a work desk, bathroom stocked with organic toiletries and a 65” 4K TV.
            </p>
            <br />
            <a href="#">
              <button type="button" class="btn btn-outline-success" value="/pricing">
                BOOK NOW
              </button>
            </a>
          </div>
        </div>
      </div>
    </section>


    <section class="bg-white text-dark p-5 text-center text-sm-start ms-auto">
      <div class="container">
        <div class="d-sm-flex">
          <div class="text-sm-start p-4 ms-auto">
            <h3>Flavours Rituals</h3>
            <p class="lead my-4 ">
              Indulge in the daily Flavours Rituals i.e.,
              Yoga Class Everyday
              Local Farm Stand
              Torch Lighting Ceremony
              Celebrating the Day
              Live Instrumental Music
            </p>
            <br />
            
          </div>
          <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-7yhn59sglojjsf21mjuiq1zxs/file.jpg?w=540&h=360" alt="First slide" >
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-2afbm4mh9d8m8upxnlyfk6u0i/file.jpg?w=540&h=360" alt="Second slide" >
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-bfuwuapdlnnwuqv3pqc7oshnv/file.jpg?w=540&h=360" alt="Third slide">
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-1c1adse3gk0itm9hvuvxg6bed/file.jpg?w=540&h=360" alt="Third slide">
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-es1pvtrja2fnbv4rh3arrbd9s/file.jpg?w=540&h=360" alt="Third slide">
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
        </div>
      </div>
    </section>



    <section class="bg-white text-dark text-center text-sm-start ms-auto p-5">
      <div class="container">
        <div class="d-sm-flex">
          <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-93ia5pokuzxbjclbsv8joraph/file.jpg?w=540&h=360" alt="First slide" >
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-8nbi72njtua4ejc8bsjajf9ur/file.jpg?w=540&h=360" alt="Second slide" >
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-7x4g8zg7kg935w6fp9rdqa3uz/file.jpg?w=540&h=360" alt="Third slide">
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-2cvzto79xc2d9lb7ywcayfq33/file.jpg?w=540&h=360" alt="Third slide">
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
          <div class="text-sm-start p-4 ms-auto">
            <h3>Flavours Amenities</h3>
            <p class="lead my-4 ">
              A range of amenities to elevate your stay at Shashi Hotel i.e.,
              Outdoor swimming pool, Jacuzzi, sauna and fitness center, 
              An elevated culinary experience brought to you by a Michelin-Star team,
              In-Room technology curated to elevate your productivity,
              Numerous indoor-outdoor meeting and event spaces,
              On-site (valet) parking.
            </p>
            <br />
            
          </div>
      </div>
    </div>
    </section>
    
    
    
    <section class="bg-white text-dark p-5 text-center text-sm-start ms-auto">
      <div class="container">
        <div class="d-sm-flex">
          <div class="text-sm-start p-4 ms-auto">
            <h3>Flavours Environment</h3>
            <p class="lead my-4 ">
              Join the Shashi Green Program—where every step counts i.e.,
              25% of power generated onsite,
              10 On-site Electric Vehicle Charging Stations,
              Recycled Water for Landscaping
              Celebrating the Day
              Bike Storage Racks (Long-term & Short-term).
            </p>
            <br />
            
          </div>
          <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-6nnjt53hrhypkzgctspi2lt19/file.jpg?w=540&h=360" alt="First slide" >
              </div>
              <div class="carousel-item">
                <img class="ms-auto d-none d-sm-block" src="https://image-tc.galaxy.tf/wijpeg-74y5nszmed8cetr2nsdgtkvmp/file.jpg?w=540&h=360" alt="Second slide" >
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
          </div>
        </div>
      </div>
    </section>



    
      
     

<!-- footer -->
<%@include file="footer.jsp" %>

  </body>
</html>

