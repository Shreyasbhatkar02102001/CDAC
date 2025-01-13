using MathEngineApp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MathEngineTest
{
    [TestClass]
    public class TestMath
    {
        private MathEngine mathEngine;

        [TestInitialize]
        public void setup()
        {
            mathEngine = new MathEngine();
        }

        [TestMethod]
        public void Addition()
        {
            int result = mathEngine.Add(20, 10);
            Assert.AreEqual(30, result);
        }

        [TestMethod]
        public void Substraction()
        {
            int result = mathEngine.Sub(20, 10);
            Assert.AreEqual(10, result);
        }

        [TestMethod]
        public void Multiplication()
        {
            int result = mathEngine.Mul(20, 10);
            Assert.AreEqual(200, result);
        }

        [TestMethod]
        public void Division()
        {
            int result = mathEngine.Div(20, 10);
            Assert.AreEqual(2, result);
        }
    }

}
