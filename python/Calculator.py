def sum(a, b):
  return a + b

def sub(a, b):
  if b > a:
    return b - a
  return a - b

def mul(a, b):
  return a * b

def div(a, b):
  if not b:
    return None
  return a / b

def test(result, expected):
  if(result != expected):
    print("Test FAIL")
    return False
  print("Test OK")
  return True

def main():
  testResult = True
  testResult &= test(sum(10, 2), 12)
  testResult &= test(sub(0, 2), 2)
  testResult &= test(sub(2, 10), 8)
  testResult &= test(div(10, 2), 5)
  testResult &= test(div(10, 0), None)
  testResult &= test(mul(10, 2), 20)

  if(not testResult):
    raise Exception("Nem todos os testes passaram.")

main()