<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Garage91 - Access XML via PHP</title>
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">
  <style>
    body { font-family: 'Poppins', sans-serif; background-color: #121212; color: #ffffff; text-align: center; padding: 20px; }
    .container { background: #1f1f1f; padding: 30px; border-radius: 10px; max-width: 600px; margin: auto; box-shadow: 0 0 10px #ff5e00; }
    h2 { color: #ff5e00; }
    table { width: 100%; border-collapse: collapse; }
    th { background: #ff5e00; color: white; padding: 10px; }
    td { padding: 10px; border-bottom: 1px solid #2b2b2b; }
  </style>
</head>
<body>
  <div class="container">
    <h2>Garage91 Accessories (via PHP)</h2>
    <table>
      <tr><th>Name</th><th>Price</th><th>Stock</th></tr>
      <?php
        // Access XML via PHP (SimpleXML)
        $xml = simplexml_load_file("accessories.xml") or die("Error: Cannot load XML");
        foreach ($xml->accessory as $accessory) {
          echo "<tr>";
          echo "<td>" . $accessory->name . "</td>";
          echo "<td>" . $accessory->price . "</td>";
          echo "<td>" . $accessory->stock . "</td>";
          echo "</tr>";
        }
      ?>
    </table>
  </div>
</body>
</html>