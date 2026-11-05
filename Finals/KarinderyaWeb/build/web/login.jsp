<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Karinderya Login</title>
  <style>
    body { font-family: Arial; background: #f4f4f4; }
    .box { width: 300px; margin: 100px auto; padding: 20px;
           background: white; border-radius: 8px; }
    input { width: 100%; padding: 8px; margin: 6px 0 12px; box-sizing: border-box; }
    button { width: 100%; padding: 10px; }
    .error { color: red; }
  </style>
</head>
<body>
  <div class="box">
    <h2>Karinderya Login</h2>
    <form action="login" method="post">
      <label>Username</label>
      <input type="text" name="username" required>
      <label>Password</label>
      <input type="password" name="password" required>
      <button type="submit">Login</button>
    </form>
    <p class="error">${error}</p>
  </div>
</body>
</html>